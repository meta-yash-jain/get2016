package DS_Assignment4_1;

public class Jobs implements Comparable<Jobs> {
	private String name; 
	private int priority;
	
	private final String CHAIR = "chairman papers";
	private final String PROFESSORS = "professor papers";
	private final String GRADUATES = "graduate papers";
	private final String UNDERGRADUATES = "undergraduate papers";
	
	private final int CHAIRPRIORITY = 4;
	private final int PROFESSORSPRIORITY = 3;
	private final int GRADUATESPRIORITY = 2;
	private final int UNDERGRADUATESPRIORITY = 1;

	@Override
	public int compareTo(Jobs otherJob) {
		if(this.getPriority() > otherJob.getPriority()){
			return 1;
		} else if(this.getPriority() < otherJob.getPriority()){
			return -1;
		} else {
			return 0;
		}
	}
	/**
	 * @return name of the job
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name is set for this job
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the priority of this job
	 */
	public int getPriority() {
		return priority;
	}
	/**
	 * @param priorityName is type of job accordingly it set name and priority
	 */
	public void setPriority(int priorityName) {
		if(priorityName == CHAIRPRIORITY){
			priority = CHAIRPRIORITY;
			this.setName(CHAIR);
		}else if(priorityName == PROFESSORSPRIORITY){
			priority = PROFESSORSPRIORITY;
			this.setName(PROFESSORS);
		}else if(priorityName == GRADUATESPRIORITY){
			priority = GRADUATESPRIORITY;
			this.setName(GRADUATES);
		}else if(priorityName == UNDERGRADUATESPRIORITY){
			priority = UNDERGRADUATESPRIORITY;
			this.setName(UNDERGRADUATES);
		}
	}
}
