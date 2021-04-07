package elevador;

public class Elevador {

	// Atributos
	private int andarAtualElev; // Atributo que informa qual andar atual do elevador
	private int andarAtualPess; // Atributo que informa qual andar o usuario está
	private boolean insideElev; // Atributo que informa se o usuario está no elevador

	// Construtor
	public Elevador() {
		this.setAndarAtualElev(0);  // Elevador começa no Terreo (andar 0)
		this.alguemPegouElev();     // Logo após alguma pessoa pega o elevador que fica em um andar aleatório
		this.setInsideElev(false);  // Iniciar sem ninguem dentro do elevador
	}
	
	//Métodos
	
	//Método para chamar o elevador!!
	public String chamarElevador() {
		String resposta = "";
		if (this.getAndarAtualElev() == this.getAndarAtualPess()) {         // 1a condicao, pergunta se o elevador está no msmo andar do usuario??
			return "Elevador já está no andar!!! \n";             				// se sim, informa a mensagem!
		} else {
			if (this.getAndarAtualElev() > this.getAndarAtualPess()) {      // 2a condicao, pergunta se o elevador tá em um andar mais alto q o do usuario?
				resposta+= "Você pediu o elevador! \n";               			// se sim, ele faz um loop descendo até o andar atual do usuario 
				resposta+= "Elevador Descendo!! \n";
				resposta+= ((this.getAndarAtualElev() == 0) ? ("T") : (this.getAndarAtualElev())) + "\n";
				do {
					this.setAndarAtualElev(this.getAndarAtualElev() - 1);
					resposta+= ((this.getAndarAtualElev() == 0) ? ("T") : (this.getAndarAtualElev())) + "\n";
				}while(this.getAndarAtualElev() != this.getAndarAtualPess());
				return resposta;
			}else {                                                         //3a e ultima condição possivel, qnd o elevador tá em um andar mais baixo que o do usuario
				resposta+= "Você pediu o elevador! \n";             			 //faz um loop subindo o elevador até o andar atual da pessoa.					
				resposta+= "Elevador Subindo!! \n";
				resposta+= ((this.getAndarAtualElev() == 0) ? ("T") : (this.getAndarAtualElev())) + "\n";
				do {
					this.setAndarAtualElev(this.getAndarAtualElev() + 1);
					resposta+= ((this.getAndarAtualElev() == 0) ? ("T") : (this.getAndarAtualElev())) + "\n";
				}while(this.getAndarAtualElev() != this.getAndarAtualPess());
				return resposta;
			}
		}
	}
	
	//Método para entrar no elevador!!
	public String entrarElevador() {
		if(this.getAndarAtualElev() != this.getAndarAtualPess()) {          //1a condicao, pergunta se o elevador está no msmo andar do usuario??
			return "Você precisa chamar o elevador primeiro \n";  //se não, informa a mensagem pedindo para chamar o elevador antes
		}else {
			if(this.isInsideElev()) {                                       //pergunta se a pessoa já está dentro do elevador?
				return "Você já está dentro do elevador\n";      //se sim informa a mensagem.
			}else {
				this.setInsideElev(true);                                   //ultima condição, quando o usuario ta no msmo andar do elevador e nao ta dentro do elevador, ele entra no elevador!!
				return "Você entrou do Elevador! \n";             //Mensagem que entrou no elevador!!!
			}
		}
	}
	
	//Metodo para escolher o andar!!!
	public String escolherAndar(int andar) {
		String resposta = "";
		if(!this.isInsideElev()) {                                                          //Verifica se a pessoa esta dentro do elevador???
			resposta += "Você precisa esta dentro do Elevador!! \n";                   //Se não, informa que precisa esta dentro do elevador primeiro
			return resposta;
		}else {
			if(this.getAndarAtualElev() > andar) {                                          //1a condição , se o andar que o usuario escolheu é menor que o andar atual
				resposta += ((andar == 0) ? ("Você escolheu o Térreo!!") : ("Você escolheu o "+andar+"° andar!!")) +  "\n";                   //informa que andar ela escolheu
				resposta += "Elevador Descendo!! \n";
				resposta += ((this.getAndarAtualElev() == 0) ? ("T") : (this.getAndarAtualElev())) + "\n";
				do {                                                                        //faz um loop descendo o elevador até o andar que a pessoa escolheu	
					this.setAndarAtualElev(this.getAndarAtualElev() - 1 );
					resposta += ((this.getAndarAtualElev() == 0) ? ("T") : (this.getAndarAtualElev())) + "\n";
				}while(this.getAndarAtualElev() != andar);
				resposta += "O Elevador chegou no andar ";
				resposta += ((this.getAndarAtualElev() == 0) ? ("Térreo") : (this.getAndarAtualElev())) + "\n";
				this.setAndarAtualPess(this.getAndarAtualElev());
				return resposta;
			}else {
				if(this.getAndarAtualElev() < andar) {                                      //2a condição , se o andar que o usuario escolheu é maior que o andar atual
					resposta += "Você escolheu o "+andar+"° andar!! '\n";              		//informa que andar ela escolheu
					resposta += "Elevador Subindo!! \n";
					resposta += ((this.getAndarAtualElev() == 0) ? ("T") : (this.getAndarAtualElev())) + "\n";
					do {                                                                    //faz um loop subindo o elevador até o andar que a pessoa escolheu	
						this.setAndarAtualElev(this.getAndarAtualElev() + 1);
						resposta += ((this.getAndarAtualElev() == 0) ? ("T") : (this.getAndarAtualElev())) + "\n";
					}while(this.getAndarAtualElev() != andar);
					resposta += "O Elevador chegou no andar ";
					resposta += ((this.getAndarAtualElev() == 0) ? ("T") : (this.getAndarAtualElev())) + "\n";
					this.setAndarAtualPess(this.getAndarAtualElev());
					return resposta;
				}else {                                                                     //ultima condição se o andar que o usuario escolheu, for o mesmo do atual
					resposta += "O Elevador já está nesse andar!! \n";                 		//informa a mensagem
					return resposta;
				}
			}
		}
	}
	
	//Método para sair do Elevador
	public String sairElevador() {
		if(!this.isInsideElev()) {                                                          //Pergunta se o usuario esta dentro do elevador??
			return "Você ja está fora do elevador!! \n";                           			//Se não, informa a mensagem que o usuario ja esta fora do elevador
		}else {                                                                             //Se sim
			this.setInsideElev(false);                                                      //O usuario sai do elevador
			return "Você saiu do Elevador!! \n";                                 			 //Informa a mensagem
		}
	}
	
	//Metodo para quando alguma outra pessoa chama o elevador!
	public int alguemPegouElev() {
		this.setAndarAtualElev(1 + (int) (Math.random() * 15));                             //Sorteia um numero aleatorio de 1 a 15 (inicialmente o predio vai só tem 15 andares)
		return this.getAndarAtualElev();                                                    //Retorna o valor
	}
	
	//Método que informa o status atual do elevador
	public String status() {
		String andPess =((this.getAndarAtualElev() == 0) ? ("T") : (this.getAndarAtualElev())) + "";
		String andElev =((this.getAndarAtualPess() == 0) ? ("T") : (this.getAndarAtualPess())) + ""; 
		final String s  = ("O andar que você está é:                 "+ andElev + "\n")
				  		+ ("O andar que o elevator está é:        "+ andPess + "\n")
				  		+ ("Você está dentro do elevador?:    ") 
				  		+ (this.isInsideElev()? "Sim" : "Não" + "\n");
		return s;
	}
	
	//Metodos Getters e Setters
	public int getAndarAtualElev() {
		return andarAtualElev;
	}

	public void setAndarAtualElev(int andarAtualElev) {
		this.andarAtualElev = andarAtualElev;
	}

	public int getAndarAtualPess() {
		return andarAtualPess;
	}

	public void setAndarAtualPess(int andarAtualPess) {
		this.andarAtualPess = andarAtualPess;
	}

	public boolean isInsideElev() {
		return insideElev;
	}

	public void setInsideElev(boolean insideElev) {
		this.insideElev = insideElev;
	}
	
}