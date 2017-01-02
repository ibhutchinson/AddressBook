package main;

/**
 * Created by isaachutchinson1 on 11/24/16.
 */
public class Test {

    public static void main(String[] args) {
        AddressList addressList = new AddressList();
        System.out.println(addressList.isEmpty());
       /* addressList.addToFront("Adrean","000-000-0001","akadi@radford.edu","Blahdress","01/02/89");
        addressList.addToFront("Isaac","000-000-0002","ihutchinson@radford.edu","Blahdress","06/03/94");
        addressList.addToFront("adam","000-000-0003","amonahan@radford.edu","Blahdress","06/03/95");
        addressList.addToFront("Bill","000-000-0004","wbhutch@gmail.com","Blahdress","09/03/54");
        addressList.addToFront("jimmy","000-000-0005","jimmy@radford.edu","Blahdress","06/03/94");*/
        addressList.addToBack("Adrean", "000-000-0001", "akadi@radford.edu", "Blahdress", "01/02/89");
        addressList.addToBack("Isaac", "000-000-0002", "ihutchinson@radford.edu", "Blahdress", "06/03/94");
        addressList.addToBack("adam", "000-000-0003", "amonahan@radford.edu", "Blahdress", "06/03/95");
        addressList.addToBack("Bill", "000-000-0004", "wbhutch@gmail.com", "Blahdress", "09/03/54");
        addressList.addToBack("jimmy", "000-000-0005", "jimmy@radford.edu", "Blahdress", "06/03/94");

        System.out.println(addressList.isEmpty());
        System.out.println(addressList.toString());
        System.out.println("Another one!");
        System.out.println(addressList.toString());
        System.out.println(addressList.sizeOf());
        System.out.println(addressList.phoneNumberByName("jimmy"));
        System.out.println(addressList.emailByName("jimmy"));
        System.out.println(addressList.nameByPhoneNumber("000-000-0005"));
        System.out.println(addressList.dobByName("Isaac"));
        System.out.println();
        System.out.println(addressList.reverseToString());
        System.out.println();
        System.out.println(addressList.reverse());
        System.out.println(addressList.toString());

        //addressList.addToFront("Back","000-000-000","back@radford.edu","backaddress","06/06/05");
        System.out.println(addressList.toString());
    }
}
