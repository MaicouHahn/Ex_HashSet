package entities;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class LogEntry{
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private String name;
	private Date date;
	
	public LogEntry(String name,Date date ) {
		this.name=name;
		this.date=date;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "User = name: " + name + " date: " + date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(name, other.name);
	}

	

	
	
}
