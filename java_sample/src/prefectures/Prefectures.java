package prefectures;

public class Prefectures {
	public String todoufukennmei;
	public String kenntyousyozaitimei;
	public double mennseki;

	public Prefectures(String todoufukennmei, String kenntyousyozaitimei, double mennseki) {

		this.todoufukennmei = todoufukennmei;
		this.kenntyousyozaitimei = kenntyousyozaitimei;
		this.mennseki = mennseki;
		
	}

	public String getTodoufukennmei() {
		return todoufukennmei;
	}

	public void setTodoufukennmei(String todoufukennmei) {
		this.todoufukennmei = todoufukennmei;
	}

	public String getKenntyousyozaitimei() {
		return kenntyousyozaitimei;
	}

	public void setKenntyousyozaitimei(String kenntyousyozaitimei) {
		this.kenntyousyozaitimei = kenntyousyozaitimei;
	}

	public double getMennseki() {
		return mennseki;
	}

	public void setMennseki(double mennseki) {
		this.mennseki = mennseki;
	}
	
}
