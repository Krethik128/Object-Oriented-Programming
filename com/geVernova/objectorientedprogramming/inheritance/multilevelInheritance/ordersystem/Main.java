package geVernova.objectorientedprogramming.inheritance.multilevelInheritance.ordersystem;

public class Main {
    public static void main(String[] args){
        System.out.println("\n--- Order Management System ---");
        Order orderOne = new Order("ORD101", "2024-05-01");
        Order shippedOrder = new ShippedOrder("ORD102", "2024-05-02", "TRK999123");
        Order deliveredOrder = new DeliveredOrder("ORD103", "2024-05-03", "TRK123456", "2024-05-05");

        System.out.println("Status 1: " + orderOne.getOrderStatus());
        System.out.println("Status 2: " + shippedOrder.getOrderStatus());
        System.out.println("Status 3: " + deliveredOrder.getOrderStatus());
    }
}
