package tienlv.edu.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class MainService {

	public void init() {

	}

	public String getDayString() {
		int today;
		Calendar calendar = Calendar.getInstance();
		today = calendar.get(Calendar.DAY_OF_WEEK);

		switch (today) {
		case 1:
			return "SUNDAY";
		case 2:
			return "MONDAY";
		case 3:
			return "TUESDAY";
		case 4:
			return "WEDNESDAY";
		case 5:
			return "THURSDAY";
		case 6:
			return "FRIDAY";
		case 7:
			return "SATURDAY";
		}

		return null;
	}
}
