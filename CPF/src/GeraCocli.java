import java.time.LocalDate;
import java.time.LocalTime;

//import java.util.Date;

public class GeraCocli {

	LocalDate hoje = LocalDate.now();

	LocalTime hora = LocalTime.now();

	int cocliday = hoje.getDayOfMonth();

	int coclimes = hoje.getDayOfMonth();

	int cocliano = hoje.getYear();

	int coclihora = hora.getHour();
	
	int coclimin = hora.getMinute();

	int cocliseg = hora.getSecond();

	String cocli =  "81"+Integer.toString(cocliday) + Integer.toString(coclimes) + Integer.toString(cocliano).substring(2) 
	 	+ Integer.toString(coclimin+cocliseg+coclihora);
}
