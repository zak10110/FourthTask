package TaskFour_PhoneAndNetwork;
import java.util.LinkedList;

//4) Опишите класс Phone (одним из свойств должен быть его номер). Также опишите класс Network (сеть мобильного оператора).
//Телефон должен иметь метод
//регистрации в сети мобильного оператора.
//Также у телефона должен быть метод call (номер другого телефона),
//который переберет все телефоны, зарегистрированные в сети.
//Если такой номер будет найден, то осуществить вызов, если нет - вывести
//сообщение об ошибочности набранного номера.

public class NetWork {
    private LinkedList<String>phoneNumbers;
    public  NetWork(){
        this.phoneNumbers=new LinkedList<String>();
    }
    public boolean addPhoneNumber(String phoneNumber){
        if(!this.phoneNumbers.contains(phoneNumber)){
            this.phoneNumbers.add(phoneNumber);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean connection(String phoneNumber){
        if(this.phoneNumbers.contains(phoneNumber)){
            return true;
        }
        else {
            return false;
        }
    }
}
