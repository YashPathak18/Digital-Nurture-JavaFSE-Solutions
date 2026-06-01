package networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket =
                    new ServerSocket(5000);

            System.out.println(
                    "Server is running..."
            );

            Socket socket =
                    serverSocket.accept();

            System.out.println(
                    "Client connected."
            );

            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()
                            )
                    );

            PrintWriter writer =
                    new PrintWriter(
                            socket.getOutputStream(),
                            true
                    );

            String clientMessage =
                    reader.readLine();

            System.out.println(
                    "Client: " + clientMessage
            );

            writer.println(
                    "Hello from Server!"
            );

            reader.close();

            writer.close();

            socket.close();

            serverSocket.close();

        } catch (Exception e) {

            System.out.println(
                    "Server Error: "
                            + e.getMessage()
            );
        }
    }
}