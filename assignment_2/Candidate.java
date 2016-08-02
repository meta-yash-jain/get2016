package DS_Assignment2.assignment_2;

public class Candidate {
	private String candidateName;
	private int candidateRank;
	public Candidate(){
	}
	/**
	 * Parameterized constructor to set up the fields of candidate
	 * 
	 * @param candidateName
	 * @param candidateRank
	 */
	public Candidate(String candidateName, int candidateRank){
		this.candidateName = candidateName;
		this.candidateRank = candidateRank;
	}
	/**
	 * @param candidateName
	 */
	public void setCandidateName(String candidateName){
		this.candidateName = candidateName;
	}
	/**
	 * @return candidateName
	 */
	public String getCandidateName(){
		return this.candidateName;
	}
	/**
	 * @param candidateRank
	 */
	public void setCandidateRank(int candidateRank){
		this.candidateRank = candidateRank;
	}
	/**
	 * @return candidateRank
	 */
	public int getCandidateRank(){
		return this.candidateRank;
	}
}