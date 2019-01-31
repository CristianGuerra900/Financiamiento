package com.financiacion.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.financiacion.model.DataBean;
import com.financiacion.services.client.CotizacionClientGet;

/**
 * Servlet implementation class ServletConsumeWS
 */
@WebServlet(name = "IndexFinanciamiento", urlPatterns = { "/indexFinanciamiento" })
public class ServletConsumeWS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletConsumeWS() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
		request.setAttribute("error", "");
		String monto = request.getParameter("monto");

		if (monto.isEmpty()) {
			request.setAttribute("error", "Debe ingresar un monto");//Campo monto obligatorio en caso de que lo dejen vacio y pulsen el boton cotizar
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		} else {

			CotizacionClientGet clienteWS = new CotizacionClientGet();
			double doble = Double.parseDouble(monto);
			clienteWS.consumirServicio(doble);//Envio al cliente que consume el servicio el parametro del servicio(monto)
			
			DataBean dataBean = new DataBean();
			//Como ya quedaron los objetos JSON que retorna el servicio en un objeto JAVA lo recorremso para enviar a la JSP
			String ResponseSocioPresta = dataBean.getNombre();
			String ResponseCuotamensual = dataBean.getCuotaMensual();
			String ResponsePagoTotalCredito = dataBean.getPagoTotal();
			String ResponseTasaInteresMensual = dataBean.getTaza();

			request.setAttribute("montoRespuesta", monto);
			request.setAttribute("socioPresta", ResponseSocioPresta);
			request.setAttribute("cuotamensual", ResponseCuotamensual);
			request.setAttribute("pagoTotalCredito", ResponsePagoTotalCredito);
			request.setAttribute("tasaInteresMensual", ResponseTasaInteresMensual);

			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		}
	}

}
