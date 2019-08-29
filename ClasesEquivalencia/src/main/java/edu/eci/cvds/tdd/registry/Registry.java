package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;
public class Registry {
	ArrayList<Person> votantes = new ArrayList<Person> ();
    public RegisterResult registerVoter(Person p) {
		RegisterResult r;
		if (p.getAge() >= 0){
			if (p.isAlive() == false){
				r = RegisterResult.DEAD;
			}
			else if (p.getAge() < 18){
				r = RegisterResult.UNDERAGE;
			}
			else{
				boolean flag = false;
				int i = 0;
				while ((flag == false) && (i < votantes.size())){
					if (p.getId() == votantes.get(i).getId()){
						flag = true;
					}
					i++;
				}
				if (flag == false){
					votantes.add(p);
					r = RegisterResult.VALID;
				}	
				else{
					r = RegisterResult.DUPLICATED;	
				}	
			}
		}
		else{
			r = RegisterResult.INVALID_AGE;
		}
		return r;
    }
}