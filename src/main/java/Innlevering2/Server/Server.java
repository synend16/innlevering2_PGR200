package Innlevering2.Server;

import Innlevering2.Database.DatabaseReader;

import java.io.*;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;


public class Server {

    private ServerConnector serverConnector;
    private DatabaseReader dbReader;
    private ArrayList<ServerThreadManager> listOfThreads = new ArrayList<>();
    private int threadName = 1;

    public Server(ServerConnector serverConnector, DatabaseReader dbReader){
        this.dbReader = dbReader;
        this.serverConnector = serverConnector;
    }

    /**
     * Creates new threads for each user and adds it to an ArrayList
     * @throws IOException
     * @throws SQLException
     */
    public void runServer() throws IOException, SQLException{
        while (true){
            Socket socket = serverConnector.getServerSocket().accept();
            ServerThreadManager thread = new ServerThreadManager(socket, dbReader);
            thread.start();
            listOfThreads.add(thread);
            threadName++;
            thread.setName("Client " + threadName);
            System.out.println("Number of clients connected: " + listOfThreads.size());
        }
    }






}
