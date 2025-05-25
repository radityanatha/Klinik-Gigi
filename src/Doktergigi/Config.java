/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Doktergigi;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author VICTUS
 */

public class Config {
    // URL, user dan password database
    private static final String URL = "jdbc:mysql://localhost:3306/db_kelompok7";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // metode untuk menulis log ke file
    public static void writeLog(String message) {
        // menambahkan timestamp pada log
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);

        // try-catch dua variabel hasil instance yaitu fwLog dan pwLog
        try (FileWriter fwLog = new FileWriter("log.txt", true);
             PrintWriter pwLog = new PrintWriter(fwLog)) {
            pwLog.println(timestamp + " - " + message);
            System.out.println("Log berhasil ditulis");
        } catch (IOException e) {
            System.out.println("Gagal menulis log: " + e.getMessage());
        }
    }

    public static Connection configDB() {
        Connection mySQLConfig = null;
        // mencoba koneksi ke database
        try {
            mySQLConfig = DriverManager.getConnection(URL, USER, PASSWORD);
            if (mySQLConfig.isValid(2)) { // cek validasi dengan timeout 2 detik
                writeLog("Koneksi berhasil ke database."); // jika koneksi berhasil
            }
        } catch (SQLException e) {
            writeLog("Koneksi gagal: " + e.getMessage()); // jika koneksi gagal
        }
        return mySQLConfig;
    }
}
