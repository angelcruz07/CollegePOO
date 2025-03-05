package com.acortador;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class Acortar {
  public Acortar() {
  }

  public String shortUrl(String longURL) {
    try {
      // 1. Crear una Uniform Resource Identifier (URI) a partir de la URL larga
      URI uri = new URI("https://tinyurl.com/api-create.php?url=" + longURL);
      // 2.Convertir la URI en una Uniform Resource Locator (URL)
      URL url = uri.toURL();
      // 3. Abrir un BufferedReader para leer la URL acortada
      BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      // 4. Leer url acortada
      String shortURL = reader.readLine();

      // 5. Cerrar el BufferedReader
      reader.close();

      // 5. Retornar la URL acortada
      return shortURL;

    } catch (Exception e) {
      return ("Error: " + e.getMessage());
    }
  }
}
