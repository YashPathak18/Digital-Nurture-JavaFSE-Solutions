package networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) {

        try {

            Socket socket =
                    new Socket(
                            "localhost",
                            5000
                    );

            PrintWriter writer =
                    new PrintWriter(
                            socket.getOutputStream(),
                            true
                    );

            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()
                            )
                    );

            writer.println(
                    "Hello from Client!"
            );

            String serverMessage =
                    reader.readLine();

            System.out.println(
                    "Server: " + serverMessage
            );

            reader.close();

            writer.close();

            socket.close();

        } catch (Exception e) {

            System.out.println(
                    "Client Error: "
                            + e.getMessage()
            );
        }
    }
}