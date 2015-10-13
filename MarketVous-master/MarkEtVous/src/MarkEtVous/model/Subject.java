package MarkEtVous.model;
import java.util.ArrayList;
import java.util.List;
/**
 * The class who define a Subject
 * @author Jondet Guezel Coste Litzenburger
 *
 */
public class Subject 
{

	/**
	 * The name of the subject
	 */
	private final String subjectname;
	/**
	 * the coefficient of the subject
	 */
	private final float coefficient;
	/**
	 * the average of the subject
	 */
	private  float averageSubject;
	
	/**
	 * A list of mark of a Subject
	 */
	public List<Mark> listOfMark;
	
	
	
	/**
	 * Constructor of subject
	 * @param subject
	 * @param coef
	 */
	public Subject(String subject , float coef)
	{
		this.listOfMark=new ArrayList<Mark>();
		this.subjectname=subject;
		this.coefficient=coef;
	}
	
	/**
	 * Getter of average subject
	 * @return
	 */
	public  float getAverageSubject() {
		return averageSubject;
	}

	/**
	 * Setter of average subject
	 * @param averageSubject
	 */
	public void setAverageSubject(float averageSubject) {
		this.averageSubject = averageSubject;
	}

	/**
	 * Getter of list of mark
	 * @return listOfMark
	 */
	public List<Mark> getListOfMark() {
		return listOfMark;
	}

	/**
	 * Setter of list of mark
	 * @param listOfMark
	 */
	public void setListOfMark(List<Mark> listOfMark) {
		this.listOfMark = listOfMark;
	}

	/**
	 * Getter of subject name
	 * @return subjectname
	 */
	public String getSubjectname() {
		return subjectname;
	}

	/** Getter of coefficient
	 * @return coefficient
	 */
	public float getCoefficient() {
		return coefficient;
	}

	/**
	 * Add a mark in the list of mark of the Subject
	 * @param mark : the value of the mark
	 */
	public void addMark (float mark,float coef)
	{
		this.listOfMark.add( new Mark(mark,coef));
	}
	
	

	
	
}
