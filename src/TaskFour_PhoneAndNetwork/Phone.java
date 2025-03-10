package TaskFour_PhoneAndNetwork;

//4) Опишите класс Phone (одним из свойств должен быть его номер). Также опишите класс Network (сеть мобильного оператора).
//Телефон должен иметь метод
//регистрации в сети мобильного оператора.
//Также у телефона должен быть метод call (номер другого телефона),
//который переберет все телефоны, зарегистрированные в сети.
//Если такой номер будет найден, то осуществить вызов, если нет - вывести
//сообщение об ошибочности набранного номера.
public class Phone {
    private String number;
    public Phone(String number){
        this.number=number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String registration(NetWork netWork){
        if (netWork.addPhoneNumber(this.number)){
            return "Your Number Successfully Registered";
        }
        else{
            return "This Number Already Registered";
        }
    }
    public String call(NetWork netWork,Phone phone){
        if(netWork.connection(phone.number)){
            return "Establishing a connection";
        }
        else {
            return "This number does not exist";
        }

    }
}
