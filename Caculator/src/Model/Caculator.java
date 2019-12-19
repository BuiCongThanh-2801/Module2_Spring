package Model;

public class Caculator {
    public static String caculator(float num1, float num2, String operator){
        switch (operator){
            case "Cộng(+)":
                return num1+"+"+num2+"="+(num1+num2);
            case "Trừ(-)":
                return num1+"-"+num2+"="+(num1-num2);
            case "Nhân(*)":
                return num1+"*"+num2+"="+(num1*num2);
            case "Chia(/)":
                if (num2 !=0) {
                    return num1 + "/" + num2 + "=" + (num1 / num2);
                }
                else {
                    return "số chia phải khác 0";
                }
            default:
                throw new RuntimeException("Phep tinh không hợp lệ");
        }
    }
}
