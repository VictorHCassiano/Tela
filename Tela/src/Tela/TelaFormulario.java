package Tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.util.EventListener;
import java.awt.CardLayout;
import java.awt.FlowLayout;


public class TelaFormulario extends JFrame {

private JPanel Formulario;
private JTextField textField_7;
private JTextField TextData;
private JTextField TextNome;
private JTextField TextNasc;
private JTextField TextEmail;
private JTextField TextTelefone;
private JTextField TextNomeE;
private JTextField TextIdade;
private JTextField TextEndereco;
private JTextField TextBairro;
private JTextField TextEstado;
private JTextField TextCelular;
private JTextField TextRg;
private JTextField TextCidade;
private JTextField TextCelular2;
private JTextField TextTelefone2;
private JTextField TextGParentesco;
private JTextField TextMdt;
private JTextField TextAlergias;
private JTextField TextCreme;
private JTextField TextMedicamento;
private JTextField TextAtvdFisica;
private JTextField TextFrequencia;
private JTextField TextQuantH;
private final ButtonGroup buttonGroup = new ButtonGroup();
private final ButtonGroup buttonGroup_1 = new ButtonGroup();
private final ButtonGroup buttonGroup_2 = new ButtonGroup();
private final ButtonGroup buttonGroup_3 = new ButtonGroup();
private final ButtonGroup buttonGroup_4 = new ButtonGroup();
private final ButtonGroup buttonGroup_5 = new ButtonGroup();
private final ButtonGroup buttonGroup_6 = new ButtonGroup();
private final ButtonGroup buttonGroup_7 = new ButtonGroup();
private final ButtonGroup buttonGroup_8 = new ButtonGroup();
private JTextField TextEstCivil;

public static void main(String[] args) {

	EventQueue.invokeLater(new Runnable() {

		public void run() {
			try {

				TelaFormulario frame = new TelaFormulario();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	});
}

public TelaFormulario() {
	setTitle("Formulario");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(500, 50, 920, 890);
	
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	JMenu mnNewMenu = new JMenu("Menu");
	menuBar.add(mnNewMenu);
	
	JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
	mntmNewMenuItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(JFrame.EXIT_ON_CLOSE);
		}
	});;
	mnNewMenu.add(mntmNewMenuItem);
	
	Formulario = new JPanel();
	Formulario.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(Formulario);
	Formulario.setLayout(null);

	JLabel Nome = new JLabel("Nome :");
	Nome.setBounds(9, 49, 79, 19);
	Formulario.add(Nome);

	JLabel Data = new JLabel("Data:");
	Data.setBounds(9, 19, 79, 19);
	Formulario.add(Data);

	JLabel Nasc = new JLabel("Nascimento:");
	Nasc.setBounds(9, 79, 79, 19);
	Formulario.add(Nasc);

	JLabel Idade = new JLabel("Idade:");
	Idade.setBounds(325, 79, 55, 19);
	Formulario.add(Idade);

	JLabel Email = new JLabel("E-mail:");
	Email.setBounds(9, 109, 79, 19);
	Formulario.add(Email);

	JLabel Telefone = new JLabel("Telefone:");
	Telefone.setBounds(325, 109, 55, 19);
	Formulario.add(Telefone);

	JLabel Telefone2 = new JLabel("Telefone:");
	Telefone2.setVerticalAlignment(SwingConstants.TOP);
	Telefone2.setBounds(305, 283, 59, 43);
	Formulario.add(Telefone2);

	JLabel Endereco = new JLabel("Endereço:");
	Endereco.setBounds(9, 139, 79, 19);
	Formulario.add(Endereco);

	TextData = new JTextField();
	TextData.setBounds(89, 18, 86, 20);
	Formulario.add(TextData);
	TextData.setColumns(10);

	TextNome = new JTextField();
	TextNome.setBounds(89, 48, 462, 20);
	Formulario.add(TextNome);
	TextNome.setColumns(10);

	TextNasc = new JTextField();
	TextNasc.setBounds(89, 78, 226, 20);
	Formulario.add(TextNasc);
	TextNasc.setColumns(10);

	TextEmail = new JTextField();
	TextEmail.setBounds(89, 108, 226, 20);
	Formulario.add(TextEmail);
	TextEmail.setColumns(10);

	TextTelefone = new JTextField();
	TextTelefone.setBounds(381, 108, 170, 20);
	Formulario.add(TextTelefone);
	TextTelefone.setColumns(10);

	TextNomeE = new JTextField();
	TextNomeE.setBounds(89, 282, 206, 44);
	Formulario.add(TextNomeE);
	TextNomeE.setColumns(10);

	TextIdade = new JTextField();
	TextIdade.setBounds(382, 78, 169, 20);
	Formulario.add(TextIdade);
	TextIdade.setColumns(10);

	TextEndereco = new JTextField();
	TextEndereco.setBounds(89, 138, 727, 20);
	Formulario.add(TextEndereco);
	TextEndereco.setColumns(10);

	JLabel Sexo = new JLabel("Sexo:");
	Sexo.setBounds(556, 21, 46, 17);
	Formulario.add(Sexo);

	JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
	buttonGroup.add(rdbtnMasculino);
	rdbtnMasculino.setBounds(625, 17, 100, 23);
	Formulario.add(rdbtnMasculino);

	JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
	buttonGroup.add(rdbtnFeminino);
	rdbtnFeminino.setBounds(745, 17, 100, 23);
	Formulario.add(rdbtnFeminino);

	JLabel Bairro = new JLabel("Bairro:");
	Bairro.setBounds(9, 166, 79, 26);
	Formulario.add(Bairro);

	TextBairro = new JTextField();
	TextBairro.setBounds(89, 169, 462, 20);
	Formulario.add(TextBairro);
	TextBairro.setColumns(10);

	JLabel Estado = new JLabel("Estado:");
	Estado.setBounds(9, 197, 79, 26);
	Formulario.add(Estado);

	TextEstado = new JTextField();
	TextEstado.setBounds(89, 200, 462, 20);
	Formulario.add(TextEstado);
	TextEstado.setColumns(10);

	JLabel Celular = new JLabel("Celular:");
	Celular.setBounds(556, 109, 68, 19);
	Formulario.add(Celular);

	TextCelular = new JTextField();
	TextCelular.setBounds(625, 108, 191, 20);
	Formulario.add(TextCelular);
	TextCelular.setColumns(10);

	JLabel RG = new JLabel("RG:");
	RG.setBounds(556, 48, 68, 21);
	Formulario.add(RG);

	TextRg = new JTextField();
	TextRg.setBounds(625, 48, 191, 20);
	Formulario.add(TextRg);
	TextRg.setColumns(10);

	JLabel Emergencia = new JLabel("Em caso de emergencia avisar:");
	Emergencia.setBounds(351, 231, 246, 39);
	Formulario.add(Emergencia);

	JLabel Cidade = new JLabel("Cidade:");
	Cidade.setBounds(556, 170, 68, 19);
	Formulario.add(Cidade);

	TextCidade = new JTextField();
	TextCidade.setBounds(625, 169, 191, 20);
	Formulario.add(TextCidade);
	TextCidade.setColumns(10);

	JLabel Celular2 = new JLabel("Celular:");
	Celular2.setBounds(556, 203, 68, 14);
	Formulario.add(Celular2);

	TextCelular2 = new JTextField();
	TextCelular2.setBounds(625, 200, 191, 20);
	Formulario.add(TextCelular2);
	TextCelular2.setColumns(10);

	JLabel Nome2 = new JLabel("Nome:");
	Nome2.setVerticalAlignment(SwingConstants.TOP);
	Nome2.setBounds(9, 285, 79, 41);
	Formulario.add(Nome2);

	TextTelefone2 = new JTextField();
	TextTelefone2.setBounds(366, 282, 170, 44);
	Formulario.add(TextTelefone2);
	TextTelefone2.setColumns(10);

	JLabel GrauP = new JLabel("Grau de parentesco:");
	GrauP.setVerticalAlignment(SwingConstants.TOP);
	GrauP.setBounds(546, 285, 115, 41);
	Formulario.add(GrauP);

	TextGParentesco = new JTextField();
	TextGParentesco.setBounds(662, 283, 154, 43);
	Formulario.add(TextGParentesco);
	TextGParentesco.setColumns(10);

	JLabel HistoricoPaciente = new JLabel("Historico do paciente");
	HistoricoPaciente.setBounds(394, 337, 125, 14);
	Formulario.add(HistoricoPaciente);

	JLabel Motivo = new JLabel("Motivo do tratamento:");
	Motivo.setVerticalAlignment(SwingConstants.TOP);
	Motivo.setBounds(10, 366, 118, 57);
	Formulario.add(Motivo);
	Motivo.setHorizontalAlignment(SwingConstants.LEFT);

	TextMdt = new JTextField();
	TextMdt.setBounds(128, 363, 259, 60);
	Formulario.add(TextMdt);
	TextMdt.setColumns(10);

	JLabel Alergias = new JLabel("Alergias:");
	Alergias.setVerticalAlignment(SwingConstants.TOP);
	Alergias.setBounds(394, 362, 100, 60);
	Formulario.add(Alergias);

	TextAlergias = new JTextField();
	TextAlergias.setBounds(496, 363, 320, 60);
	Formulario.add(TextAlergias);
	TextAlergias.setColumns(10);

	JLabel Cremes = new JLabel("Cremes em uso:");
	Cremes.setVerticalAlignment(SwingConstants.TOP);
	Cremes.setBounds(9, 441, 109, 57);
	Formulario.add(Cremes);

	TextCreme = new JTextField();
	TextCreme.setBounds(123, 438, 264, 60);
	Formulario.add(TextCreme);
	TextCreme.setColumns(10);

	JLabel Medicamentos = new JLabel("Medicamento em uso(Via oral):");
	Medicamentos.setVerticalAlignment(SwingConstants.TOP);
	Medicamentos.setBounds(394, 441, 203, 60);
	Formulario.add(Medicamentos);

	TextMedicamento = new JTextField();
	TextMedicamento.setBounds(597, 438, 219, 60);
	Formulario.add(TextMedicamento);
	TextMedicamento.setColumns(10);

	JLabel Habitos = new JLabel("H\u00E1bitos");
	Habitos.setBounds(404, 509, 90, 32);
	Formulario.add(Habitos);

	JLabel AtvdFisica = new JLabel("Pratica atividade fisica");
	AtvdFisica.setBounds(9, 555, 119, 14);
	Formulario.add(AtvdFisica);

	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Sim");
	buttonGroup_1.add(rdbtnNewRadioButton_2);
	rdbtnNewRadioButton_2.setBounds(128, 551, 47, 23);
	Formulario.add(rdbtnNewRadioButton_2);

	JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("N\u00E3o");
	buttonGroup_1.add(rdbtnNewRadioButton_3);
	rdbtnNewRadioButton_3.setBounds(187, 551, 59, 23);
	Formulario.add(rdbtnNewRadioButton_3);

	JLabel QualAtvd = new JLabel("Qual");
	QualAtvd.setBounds(338, 555, 59, 14);
	Formulario.add(QualAtvd);

	TextAtvdFisica = new JTextField();
	TextAtvdFisica.setBounds(376, 552, 160, 20);
	Formulario.add(TextAtvdFisica);
	TextAtvdFisica.setColumns(10);

	JLabel Frequencia = new JLabel("Frqu\u00EAncia ");
	Frequencia.setBounds(543, 555, 59, 14);
	Formulario.add(Frequencia);

	TextFrequencia = new JTextField();
	TextFrequencia.setBounds(610, 552, 206, 20);
	Formulario.add(TextFrequencia);
	TextFrequencia.setColumns(10);

	JLabel Fuma = new JLabel("Fuma");
	Fuma.setBounds(9, 578, 46, 14);
	Formulario.add(Fuma);

	JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Sim");
	buttonGroup_2.add(rdbtnNewRadioButton_4);
	rdbtnNewRadioButton_4.setBounds(129, 574, 55, 23);
	Formulario.add(rdbtnNewRadioButton_4);

	JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("N\u00E3o");
	buttonGroup_2.add(rdbtnNewRadioButton_5);
	rdbtnNewRadioButton_5.setBounds(187, 577, 79, 23);
	Formulario.add(rdbtnNewRadioButton_5);

	JLabel Ingere = new JLabel("Ingere bebida alcoolica");
	Ingere.setBounds(9, 603, 119, 14);
	Formulario.add(Ingere);

	JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Muito");
	buttonGroup_3.add(rdbtnNewRadioButton_6);
	rdbtnNewRadioButton_6.setBounds(128, 599, 57, 23);
	Formulario.add(rdbtnNewRadioButton_6);

	JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Moderado");
	buttonGroup_3.add(rdbtnNewRadioButton_7);
	rdbtnNewRadioButton_7.setBounds(187, 600, 83, 23);
	Formulario.add(rdbtnNewRadioButton_7);

	JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("N\u00E3o consumo");
	buttonGroup_3.add(rdbtnNewRadioButton_8);
	rdbtnNewRadioButton_8.setBounds(271, 599, 109, 23);
	Formulario.add(rdbtnNewRadioButton_8);

	JLabel Urina = new JLabel("Urina");
	Urina.setBounds(9, 628, 46, 14);
	Formulario.add(Urina);

	JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Normal");
	buttonGroup_4.add(rdbtnNewRadioButton_9);
	rdbtnNewRadioButton_9.setBounds(128, 624, 67, 23);
	Formulario.add(rdbtnNewRadioButton_9);

	JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Pouco");
	buttonGroup_4.add(rdbtnNewRadioButton_10);
	rdbtnNewRadioButton_10.setBounds(197, 624, 73, 23);
	Formulario.add(rdbtnNewRadioButton_10);

	JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Diariamente");
	buttonGroup_4.add(rdbtnNewRadioButton_11);
	rdbtnNewRadioButton_11.setBounds(271, 624, 109, 23);
	Formulario.add(rdbtnNewRadioButton_11);

	JLabel ExposicaoaoSol = new JLabel("Exposi\u00E7\u00E3o ao sol");
	ExposicaoaoSol.setBounds(9, 649, 109, 14);
	Formulario.add(ExposicaoaoSol);

	JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("\u00C0s vezes");
	buttonGroup_5.add(rdbtnNewRadioButton_12);
	rdbtnNewRadioButton_12.setBounds(128, 645, 77, 23);
	Formulario.add(rdbtnNewRadioButton_12);

	JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Pouco");
	buttonGroup_5.add(rdbtnNewRadioButton_13);
	rdbtnNewRadioButton_13.setBounds(207, 645, 73, 23);
	Formulario.add(rdbtnNewRadioButton_13);

	JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("Diariamente");
	buttonGroup_5.add(rdbtnNewRadioButton_14);
	rdbtnNewRadioButton_14.setBounds(278, 645, 109, 23);
	Formulario.add(rdbtnNewRadioButton_14);

	JLabel Apetite = new JLabel("Apetite");
	Apetite.setBounds(9, 671, 109, 14);
	Formulario.add(Apetite);

	JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("Muito");
	buttonGroup_6.add(rdbtnNewRadioButton_15);
	rdbtnNewRadioButton_15.setBounds(128, 667, 59, 23);
	Formulario.add(rdbtnNewRadioButton_15);

	JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("Moderado");
	buttonGroup_6.add(rdbtnNewRadioButton_16);
	rdbtnNewRadioButton_16.setBounds(187, 667, 89, 23);
	Formulario.add(rdbtnNewRadioButton_16);

	JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("Pouco");
	buttonGroup_6.add(rdbtnNewRadioButton_17);
	rdbtnNewRadioButton_17.setBounds(272, 667, 71, 23);
	Formulario.add(rdbtnNewRadioButton_17);

	JLabel ConsumoDeAgua = new JLabel("Consumo de agua");
	ConsumoDeAgua.setBounds(9, 693, 109, 14);
	Formulario.add(ConsumoDeAgua);

	JRadioButton rdbtnNewRadioButton_18 = new JRadioButton("Abundante");
	buttonGroup_7.add(rdbtnNewRadioButton_18);
	rdbtnNewRadioButton_18.setBounds(128, 689, 92, 23);
	Formulario.add(rdbtnNewRadioButton_18);

	JRadioButton rdbtnNewRadioButton_19 = new JRadioButton("Moderado");
	buttonGroup_7.add(rdbtnNewRadioButton_19);
	rdbtnNewRadioButton_19.setBounds(222, 689, 93, 23);
	Formulario.add(rdbtnNewRadioButton_19);

	JRadioButton rdbtnNewRadioButton_20 = new JRadioButton("N\u00E3o consumo");
	buttonGroup_7.add(rdbtnNewRadioButton_20);
	rdbtnNewRadioButton_20.setBounds(316, 689, 109, 23);
	Formulario.add(rdbtnNewRadioButton_20);

	JLabel Sono = new JLabel("Qualidade de sono");
	Sono.setBounds(9, 718, 109, 14);
	Formulario.add(Sono);

	JRadioButton rdbtnNewRadioButton_21 = new JRadioButton("Normal");
	buttonGroup_8.add(rdbtnNewRadioButton_21);
	rdbtnNewRadioButton_21.setBounds(128, 714, 68, 23);
	Formulario.add(rdbtnNewRadioButton_21);

	JRadioButton rdbtnNewRadioButton_22 = new JRadioButton("Moderado");
	buttonGroup_8.add(rdbtnNewRadioButton_22);
	rdbtnNewRadioButton_22.setBounds(193, 714, 83, 23);
	Formulario.add(rdbtnNewRadioButton_22);

	JRadioButton rdbtnNewRadioButton_23 = new JRadioButton("Pouco");
	buttonGroup_8.add(rdbtnNewRadioButton_23);
	rdbtnNewRadioButton_23.setBounds(278, 714, 109, 23);
	Formulario.add(rdbtnNewRadioButton_23);

	JLabel QuantSono = new JLabel("Quantas horas?");
	QuantSono.setBounds(535, 718, 100, 14);
	Formulario.add(QuantSono);

	TextQuantH = new JTextField();
	TextQuantH.setBounds(639, 715, 177, 20);
	Formulario.add(TextQuantH);
	TextQuantH.setColumns(10);
	
	JButton ENVIAR = new JButton("ENVIAR");
	ENVIAR.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			 JOptionPane.showMessageDialog(null, "ANAMINESE REALIZADA COM SUCESSO", "FORMULARIO", JOptionPane.INFORMATION_MESSAGE);
		}
	});
	ENVIAR.setBounds(404, 737, 89, 23);
	Formulario.add(ENVIAR);
	
	JLabel EstadoCivil = new JLabel("Estado Civil:");
	EstadoCivil.setBounds(556, 81, 68, 14);
	Formulario.add(EstadoCivil);
	
	TextEstCivil = new JTextField();
	TextEstCivil.setBounds(625, 78, 191, 20);
	Formulario.add(TextEstCivil);
	TextEstCivil.setColumns(10);
	

}
}
