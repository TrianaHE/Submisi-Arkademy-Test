
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	/*Disarankan menggunakan REGEX
	Format email: sesuai email (satu atau lebih huruf sebelum dan sesudah simbol “@”
	 dan domain minimal 2 huruf ).
	Format phone: harus angka dan diawali “+62” dengan panjang 8-15 karakter.
	Format username: kombinasi hanya huruf kecil dengan panjang 5-9 karakter.
	Format password: merupakan kombinasi dari huruf kecil, huruf besar,
	angka, dan karakter spesial minimal satu simbol dan harus terdapat simbol “#”.
	Dengan panjang minimal 8 karakter.
*/
////////////////////////////////////////////////////
	public static void validationEmail(String email){
		String regexEmail ="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		boolean result =  email.matches(regexEmail);
		System.out.println(result);
	}
///////////////////////////////////////////////////////
	public static void validationPhone(String phone){
		boolean result = true;
		if(phone.substring(0, 3).equals("+62")){
			if(phone.length()>=8&&phone.length()<=15){
				result =true;
			}
		}else{
			result =false;
		}
		System.out.println(result);
	}
/////////////////////////////////////////////////////////
	public static void validationUserName(String userName){
		boolean result = true;
		if(userName.equals(userName.toLowerCase())){
			if(userName.length()>=5&&userName.length()<=9){
				result =true;
			}
		}else{
			result =false;
		}
		System.out.println(result);
	}
/////////////////////////////////////////////////////////////
    public static boolean hasUpper(String word) {
        char a;
        boolean lanjut = false;
        for(int i= 0; i<word.length()&&lanjut==false;i++){
        	a=word.charAt(i);
        	lanjut = Character.isUpperCase(a);
        }
        return lanjut;
    }
    public static boolean hasLower(String word) {
        char a;
        boolean lanjut = false;
        for(int i= 0; i<word.length()&&lanjut==false;i++){
        	a=word.charAt(i);
        	lanjut = Character.isLowerCase(a);
        }
        return lanjut;
    }
	public static void validationPassword(String password){
		String regex= "^.*(?=.*[@#$%^&+=]).*$";
		boolean result = true;
		boolean hasLower = hasLower(password);
		boolean hasUpper = hasUpper(password);
		Pattern p = Pattern.compile(regex);
	    Matcher m = p.matcher(password);
		if(m.matches()){
			if(password.length()>=8){
				if(hasLower==true && hasUpper==true){
					result =true;
				}
			}
		}else{
			result =false;
		}
		System.out.println(result);
	}
////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tempEmail = "trianahalim.e@gmail.com";
		String tempPhone = "+6285764984559";
		String tempUsername = "trianah.e";
		String tempPassword = "ssAdscsdcd";
		validationEmail(tempEmail);
		validationPhone(tempPhone);
		validationUserName(tempUsername);
		validationPassword(tempPassword);
	}

}
