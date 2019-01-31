package com.financiacion.services.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.financiacion.model.DataBean;
import com.google.gson.Gson;

public class CotizacionClientGet {

	public void consumirServicio(double montoACotizar) {

	  try {

		URL url = new URL("http://localhost:8080/service-app/api/prestamo/"+montoACotizar);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output;
		System.out.println("La mejor cotización es la siguiente .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			
			DataBean data = new Gson().fromJson(output, DataBean.class);//Transforma los  objetos JSON de respuesta del servicio
			                                                            //a el objeto Java DataBean

	        System.out.println(data);//Imprime por consola el JSON de respuesta del servicio
			
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	  }

	}

}