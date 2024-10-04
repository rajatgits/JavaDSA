//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertAtFirst(1);
//        list.insertAtFirst(2);
//        list.insertAtFirst(3);
//        list.insertAtFirst(4);
//        list.insertAtFirst(5);
//        list.insertAtFirst(6);
//        list.insertAtLast(99);
//        list.insert(15,6);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(2));

//        DLL list = new DLL();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertLast(99);
//        list.insert(99, 6);

        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(18);
        list.insert(8);
        list.insert(6);
        list.insert(10);
        list.delete(8);


        list.display();
    }
}