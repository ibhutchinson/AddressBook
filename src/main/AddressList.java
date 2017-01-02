package main;

/**
 * Created by isaachutchinson1 on 11/24/16.
 */
public class AddressList {
    private ListNode head;
    private ListNode currentNode;


    private class ListNode {
        private String name;
        private String tel;
        private String email;
        private String addr;
        private String dob;
        private ListNode next;

        public ListNode(String name, String tel, String email, String addr, String dob) {
            this.name = name;
            this.tel = tel;
            this.email = email;
            this.addr = addr;
            this.dob = dob;
        }

        public String getName() {
            return name;
        }

        public String getTel() {
            return tel;
        }

        public String getEmail() {
            return email;
        }

        public String getAddr() {
            return addr;
        }

        public String getDob() {
            return dob;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public AddressList() {
        head = null;


    }

    /**
     * The isEmpty method checks if the method is empty or not by checking if the head node is null. If the head node
     * is set to null then the list is empty. If the head is not set to null then the list is not empty.
     *
     * @return boolean If list is empty or not.
     */
    public boolean isEmpty() {
        boolean empty = false;
        if (head == null) {
            empty = true;
        }
        return empty;
    }

    /**
     * The addToFront method adds a new node to the front of the linked list. The method creates a new node and sets
     * its next node to head and then assigns new node to head.
     *
     * @param name    A String with a persons name.
     * @param tel     A String with a phone number.
     * @param email   A String with a email address.
     * @param address A String with a street address.
     * @param dob     A String with a date of birth.
     */
    public void addToFront(String name, String tel, String email, String address, String dob) {
        ListNode newNode = new ListNode(name, tel, email, address, dob);
        currentNode=newNode;
        currentNode.setNext(head);
        head = currentNode;

    }

    /**
     * The addToBack method recursively adds a new node to the back of the linked list. When the last node in the list
     * is found the last nodes next is set to the new node and the new nodes next is set to null.
     *
     * @param name    A String with a persons name.
     * @param tel     A String with a phone number.
     * @param email   A String with a email address.
     * @param address A String with a street address.
     * @param dob     A String with a date of birth.
     */
    public void addToBack(String name, String tel, String email, String address, String dob) {
        addNodeToBack(head, new ListNode(name, tel, email, address, dob));
    }

    private void addNodeToBack(ListNode node, ListNode newNode) {
        if (head != null) {
            if (node.getNext() != null) {
                addNodeToBack(node.getNext(), newNode);
            } else {
                node.setNext(newNode);
                newNode.setNext(null);
            }
        } else {
            head = newNode;
            head.setNext(null);
        }
    }

    /**
     * The toString method recursively prints the contents of the linked list in order.
     *
     * @return A String containing the contents of the linked list in order.
     */
    public String toString() {
        String output = "";
        output += listPrint(head);
        return output;
    }

    private String listPrint(ListNode node) {
        if (node.getNext() != null) {
            return "Name: " + node.getName() + "\n" +
                    "Telephone: " + node.getTel() + "\n" +
                    "Email: " + node.getEmail() + "\n" +
                    "Address: " + node.getAddr() + "\n" +
                    "Date of Birth: " + node.getDob() + "\n" + "\n" + listPrint(node.getNext());
        } else {
            return "Name: " + node.getName() + "\n" +
                    "Telephone: " + node.getTel() + "\n" +
                    "Email: " + node.getEmail() + "\n" +
                    "Address: " + node.getAddr() + "\n" +
                    "Date of Birth: " + node.getDob() + "\n" + "\n";
        }
    }

    /**
     * The reverseToString method recursively prints the contents of the linked list in reverse order.
     *
     * @return String containing the contents of the linked list in reverse order.
     */
    public String reverseToString() {
        return listPrintR(head);
    }

    private String listPrintR(ListNode node) {
        if (node.getNext() != null) {
            return listPrintR(node.getNext()) + "Name: " + node.getName() + "\n" +
                    "Telephone: " + node.getTel() + "\n" +
                    "Email: " + node.getEmail() + "\n" +
                    "Address: " + node.getAddr() + "\n" +
                    "Date of Birth: " + node.getDob() + "\n" + "\n";
        } else {
            return "Name: " + node.getName() + "\n" +
                    "Telephone: " + node.getTel() + "\n" +
                    "Email: " + node.getEmail() + "\n" +
                    "Address: " + node.getAddr() + "\n" +
                    "Date of Birth: " + node.getDob() + "\n" + "\n";
        }
    }

    /**
     * The reverse method recursively reverses the linked list.
     * <p>
     * Method from https://www.youtube.com/watch?v=KYH83T4q6Vs
     *
     * @return AddressList
     */
    public AddressList reverse() {
        reverseList(head);
        return this;
    }

    private void reverseList(ListNode node) {
        if (node.getNext() == null) {
            head = node;
            return;
        } else {
            reverseList(node.getNext());
            currentNode = node.getNext();
            currentNode.setNext(node);
            node.setNext(null);
        }
    }

    /**
     * The sizeOf method recursively calculates the size of the linked list.
     *
     * @return size of linked list.
     */
    public int sizeOf() {
        int count = 0;
        count += listSize(head);

        return count;

    }

    private int listSize(ListNode node) {
        if (node.getNext() != null) {
            return 1 + listSize(node.getNext());
        } else {
            return 1;
        }

    }

    /**
     * The phoneNumberByName method recursively searches the linked list for the first node that contains
     * the matching name and then it gets the phone number contained in that node.
     *
     * @param name The name that you want to search the linked list by.
     * @return The phone number contained in that node that matched the name.
     */
    public String phoneNumberByName(String name) {
        return listSearchPhoneNumber(head, name);
    }

    private String listSearchPhoneNumber(ListNode node, String name) {
        if (node.getNext() != null) {
            if (!(node.getName().equals(name))) {
                return listSearchPhoneNumber(node.getNext(), name);
            } else {
                return "Phone Number:" + node.getTel();
            }
        }
        if (node.getNext() == null && node.getName().equals(name)) {
            return "Phone Number:" + node.getTel();
        }
        return "No matching data";
    }

    /**
     * The emailByName method recursively searches the linked list for the first node that contains
     * the matching name and then it gets the email contained in that node.
     *
     * @param name The name that you want to search the linked list by.
     * @return The email contained in that node that matched the name.
     */
    public String emailByName(String name) {
        return listSearchEmail(head, name);
    }

    private String listSearchEmail(ListNode node, String name) {
        if (node.getNext() != null) {
            if (!(node.getName().equals(name))) {
                return listSearchEmail(node.getNext(), name);
            } else {
                return "Email: " + node.getEmail();
            }
        }
        if (node.getNext() == null && node.getName().equals(name)) {
            return "Email: "+node.getEmail();
        }
        return "No matching data";
    }

    /**
     * The nameByPhoneNumber method recursively searches the linked list for the first node that contains
     * the matching telephone number and then gets the name contained in that node.
     *
     * @param tel The phone number that you want to search the linked list by.
     * @return The name contained in the node that matched the telephone number.
     */
    public String nameByPhoneNumber(String tel) {
        return listSearchName(head, tel);
    }

    private String listSearchName(ListNode node, String tel) {
        if (node.getNext() != null) {
            if (!(node.getTel().equals(tel))) {
                return listSearchName(node.getNext(), tel);
            } else {
                return "Name: " + node.getName();
            }
        }
        if (node.getNext() == null && node.getTel().equals(tel)) {
            return node.getName();
        }
        return "No matching data";
    }

    /**
     * The dobByName method recursively searches the linked list for the first node that contains
     * the matching name and then gets the date of birth contained in that node.
     *
     * @param name The name that you want to search the linked list by.
     * @return The date of birth contained in the node that matched the name;
     */
    public String dobByName(String name) {
        return listSearchDob(head, name);
    }

    private String listSearchDob(ListNode node, String name) {
        if (node.getNext() != null) {
            if (!(node.getName().equals(name))) {
                return listSearchDob(node.getNext(), name);
            } else {
                return "Date of Birth: " + node.getDob();
            }
        }
        if (node.getNext() == null && node.getName().equals(name)) {
            return "Date of Birth: " +  node.getDob();
        }
        return "No matching data";
    }
}
