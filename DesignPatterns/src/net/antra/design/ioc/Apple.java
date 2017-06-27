package net.antra.design.ioc;

@Antra(companyValue = "sdf")
public class Apple {

    @Antra(companyValue = ".Net is OK")
    private String color;

    @Antra
    public String getColor(){
        return color;
    }
}
