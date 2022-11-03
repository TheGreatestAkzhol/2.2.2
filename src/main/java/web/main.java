package web;

import web.dao.CarDao;

public class main {
    public static void main(String[] args) {
        CarDao carDao = new CarDao();
        carDao.show(6).stream().forEach(x-> System.out.println(x.getSeries()));
    }
}
