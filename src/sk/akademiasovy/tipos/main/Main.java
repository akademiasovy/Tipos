package sk.akademiasovy.tipos.main;

import sk.akademiasovy.tipos.Bet;
import sk.akademiasovy.tipos.Tipos;
import sk.akademiasovy.tipos.database.MySQLDatabase;

import java.util.List;

/**
 * Created by host on 30.1.2018.
 */
public class Main {
    public static void main(String[] args) {
        Tipos tipos=new Tipos();
        tipos.generate();
        tipos.print();

        MySQLDatabase mySQLDatabase=new MySQLDatabase();
        //mySQLDatabase.testConnection();
        mySQLDatabase.insertValuesIntoDrawHistory(tipos.getArr());
        List<Bet> list=mySQLDatabase.getNewBets();
        tipos.printNewBets(list);
    }


}
