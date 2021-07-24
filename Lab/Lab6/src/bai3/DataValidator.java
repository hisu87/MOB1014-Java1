package bai3;

public class DataValidator {
    public boolean isEmail(String st){
        String pattern = "\\w+@\\w+\\.\\w+";
        return st.matches(pattern);
    }
    public boolean isSDT(String st){
        String pattern = "0\\d{9}";
        return st.matches(pattern);
    }
    public boolean isCMND(String st){
        String pattern = "\\d{9}";
        return st.matches(pattern);
    }
    
}
