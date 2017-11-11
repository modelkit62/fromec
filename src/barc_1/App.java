package barc_1;

public class App {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;

	public int instructionType;
	public int priority;

	public App(int instructionType) {
		this.instructionType = instructionType;
		setPriority(instructionType);
	}

	public int getInstructionType() {
		return instructionType;
	}

	public void setInstructionType(int instructionType) {
		this.instructionType = instructionType;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int instructionType) {
		if (instructionType < 11) {
			this.priority = LOW;
		} else if (instructionType > 89) {
			this.priority = HIGH;
		} else {
			this.priority = MEDIUM;
		}
	}

	public String priorityToString(int priority) {
		switch (priority) {
		case HIGH:
			return "High";
		case MEDIUM:
			return "Medium";
		}
		return "Low";
	}

	public boolean isValid() {
		try {
			validateMessage(this);
		} catch (InvalidMessageException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	private void validateMessage(App app) throws InvalidMessageException {
		if (app.getInstructionType() <= 0 || app.getInstructionType() >= 100) {
			throw new InvalidMessageException(String.valueOf(app.getInstructionType()) + " invalid");
		}

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hola este es el valor: ");
		sb.append(priorityToString(priority));
		return sb.toString();
	}

	public boolean enqueue(App app) {
		if (app.isValid()) {
			System.out.println("Es valido!");
		}
		return false;
	}

	public static void main(String[] args) {
		App a = new App(9);
		a.enqueue(a);
		System.out.println(a.priority);
		System.out.println(a.toString());
		a.setInstructionType(98);
		a.enqueue(a);
		System.out.println(a.priority);
		System.out.println(a.toString());
		App b = new App(98);
		b.enqueue(b);
		System.out.println(b.priority);
		System.out.println(b.toString());
	

	}

}
