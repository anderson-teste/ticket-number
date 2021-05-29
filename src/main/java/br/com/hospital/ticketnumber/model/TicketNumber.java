package br.com.hospital.ticketnumber.model;

public class TicketNumber {

	private Long id; 
	private String codeTicketNumber; // numero do ticket de atendimento do paciente;
	private String fullName; // Nome completo do paciente
	private String document; // Numero de documento, por exemplo o CPF
	private boolean preferential; // Paciente preferêncial ou comum
	private boolean attended = false; // Paciente foi atendido pelo médico
	
}
