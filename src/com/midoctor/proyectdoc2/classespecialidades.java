package com.midoctor.proyectdoc2;

public class classespecialidades {
    private String Id;
    private String name;
    private String detalle;
    private String telefono;
    private String correo;
    private String code;
    private String coordenadasla;
    private String coordenadaslo;
    private String direccion;
    private String website;
    public classespecialidades(String id, String Name ,String Detalle ,String Telefono,String Correo , String Code , String Coordenadasla,String Coordenadaslo, String Direccion, String Website){
       Id =id;
       name = Name;
       detalle = Detalle;
       telefono = Telefono;
       correo = Correo;
       coordenadasla =Coordenadasla;
       coordenadaslo =Coordenadaslo;
       code =Code;
       direccion =Direccion;
       website = Website;
    }


    public String getId(){
        return Id;
    }
    public String Name(){
        return name;
    }
    public String Detalle(){
        return detalle;
    }
    public String telefono(){
        return telefono;
    }
    public String correo(){
        return correo;
    }
    public String Code(){
        return code;
    }
    public String Coordenadasla(){
        return coordenadasla;
    }
    public String Coordenadaslo(){
        return coordenadaslo;
    }
    public String Direccion(){
        return direccion;
    }
    public String Website(){
        return website;
    }
    
}