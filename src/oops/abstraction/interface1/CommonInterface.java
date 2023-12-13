package oops.abstraction.interface1;

public interface CommonInterface extends Mango{
void season();
default  void show(){//whenever we want extra method in particulate interface & that interface implement by thousand class
    //then we are able to add default method.
    System.out.println("This is the default show method");
}

}
