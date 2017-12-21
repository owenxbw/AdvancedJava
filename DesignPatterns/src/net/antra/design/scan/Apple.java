package net.antra.design.scan;

@Antra(companyValue = "sdf")
public class Apple {

    @Antra(companyValue = ".Net is OK")
    private String color;

    @Antra
    public String getColor(){
        return color;
    }
}
