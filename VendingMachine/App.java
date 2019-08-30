/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine;

import Controller.VMController;
import UI.UserIO;
import UI.VMView;
import VMDao.VMDao;
import VMServiceLayer.VMServiceLayer;

/**
 *
 * @author MARIA
 */
public class App {
public static void main(String[] args) throws ClassRosterDuplicateIdException {
    // Instantiate the UserIO implementation
    UserIO myIo = new UserIOConsoleImpl();
    // Instantiate the View and wire the UserIO implementation into it
    VMView myView = new VMView(myIo);
    // Instantiate the DAO
    VMDao myDao = new VMDaoFileImpl();
    // Instantiate the Audit DAO
    //ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
    // Instantiate the Service Layer and wire the DAO and Audit DAO into it
    VMServiceLayer myService = new VMServiceLayerImpl(myDao, myAuditDao);
    // Instantiate the Controller and wire the Service Layer into it
    VMController controller = new VMController(myService, myView);
    // Kick off the Controller
    controller.run();
}
}
