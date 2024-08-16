package logger;

import java.io.Serializable;

public class Log implements Serializable {
	static  long idCounter = 0;
	Long id;
	String errorMessage;
	String className;
	String methodName;
	String description;
	Long timestamp;
	
	public Log(String errorMessage, String className, String methodName, String description, Long timestamp) {
		this.id = ++idCounter;
		this.errorMessage = errorMessage;
		this.className = className;
		this.methodName = methodName;
		this.description = description;
		this.timestamp = timestamp;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString() {
		return "Log{" + "id=" + getId() +
				", \nerrorMessage='" + getErrorMessage() + '\'' +
				", \nclassName='" + getClassName() + '\'' +
				", \nmethodName='" + getMethodName() + '\'' +
				", \ndescription='" + getDescription() + '\'' +
				", \ntimestamp=" + getTimestamp() + '}';
	}
}