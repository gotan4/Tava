package MyProj.view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import MyProj.VO.*;
import MyProj.view.event.*;

public class JoinMember extends JPanel {
	public MembInfo main ;
	public JLabel nameL, idL, pwL, repwL, telL, mailL, genL, avtL;
	public JTextField id, name, tel1, tel2, mail;
	public JPasswordField pw, repw;
	public JRadioButton[] gen, avt;
	public JComboBox<String> tel0;
	public JPanel nameP, idP, pwP, repwP, telP, mailP, genP, avtP, avtContMP, avtSubP, avtContFP, blankP;
	public Image[] img;
	public JButton sBtn;
	public ButtonGroup genG, avtG;
	public MemberVO mVO;
	
	
	public JoinMember(MembInfo main) {
		this.main = main;
		mVO = new MemberVO();
		loadImg(6);
		labelInit();
	}

	public void labelInit() {
		
		JPanel mainP = new JPanel(new BorderLayout());
		JPanel subP = new JPanel();
		subP.setPreferredSize(new Dimension(500, 410));
		
		nameL = new JLabel("Name ");
		nameL.setPreferredSize(new Dimension(120, 30));
		idL = new JLabel("Member ID ");
		idL.setPreferredSize(new Dimension(120, 30));
		pwL = new JLabel("Password ");
		pwL.setPreferredSize(new Dimension(120, 30));
		repwL = new JLabel("Password Check ");
		repwL.setPreferredSize(new Dimension(120, 30));
		telL = new JLabel("Telephone ");
		telL.setPreferredSize(new Dimension(120, 30));
		mailL = new JLabel("E-Mail ");
		mailL.setPreferredSize(new Dimension(120, 30));
		genL = new JLabel("Gender ");
		genL.setPreferredSize(new Dimension(120, 30));
		avtL = new JLabel("Avatar ");
		avtL.setPreferredSize(new Dimension(120, 30));
		JPanel avtLP = new JPanel();
		avtLP.setPreferredSize(new Dimension(120, 30));
		avtLP.add(avtL);
		
		nameL.setHorizontalTextPosition(SwingConstants.RIGHT);
		nameL.setVerticalTextPosition(SwingConstants.CENTER);
		nameL.setBackground(Color.orange);
		// panel 만들기
		nameP = new JPanel(new BorderLayout());
		nameP.setPreferredSize(new Dimension(450, 30));
		idP = new JPanel(new BorderLayout());
		idP.setPreferredSize(new Dimension(450, 30));
		pwP = new JPanel(new BorderLayout());
		pwP.setPreferredSize(new Dimension(450, 30));
		repwP = new JPanel(new BorderLayout());
		repwP.setPreferredSize(new Dimension(450, 30));
		telP = new JPanel(new BorderLayout());
		telP.setPreferredSize(new Dimension(450, 30));
		mailP = new JPanel(new BorderLayout());
		mailP.setPreferredSize(new Dimension(450, 30));
		genP = new JPanel(new BorderLayout());
		genP.setPreferredSize(new Dimension(450, 30));
		avtP = new JPanel(new BorderLayout());
		avtP.setPreferredSize(new Dimension(450, 145));
//		avtL.setBackground(Color.blue);
		
		nameP.add(nameL, BorderLayout.WEST);
		idP.add(idL, BorderLayout.WEST);
		pwP.add(pwL, BorderLayout.WEST);
		repwP.add(repwL, BorderLayout.WEST);
		telP.add(telL, BorderLayout.WEST);
		mailP.add(mailL, BorderLayout.WEST);
		genP.add(genL, BorderLayout.WEST);
		avtP.add(avtLP, BorderLayout.WEST);
		
		name = new JTextField();
		id = new JTextField();
		pw = new JPasswordField();
		repw = new JPasswordField();
		
		// 전화번호
		String[] localNo = {"02", "010", "011", "031", "032", "041", "042", "051", "061"};
		tel0 = new JComboBox<String>(localNo);
		tel0.setPreferredSize(new Dimension(80, 30));
		tel1 = new JTextField();
		tel1.setPreferredSize(new Dimension(120, 30));
		tel2 = new JTextField();
		tel2.setPreferredSize(new Dimension(120, 30));
		JPanel telContP = new JPanel(new BorderLayout());
		telContP.add(tel0, BorderLayout.WEST);
		telContP.add(tel1, BorderLayout.CENTER);
		telContP.add(tel2, BorderLayout.EAST);
		
		// 메일입력
		mail = new JTextField();
		
		// avatar 선택창
		avtContMP = new JPanel(new GridLayout(1, 3));
		avtContFP = new JPanel(new GridLayout(1, 3));
		avtContMP.setPreferredSize(new Dimension(300, 100));
		avtContFP.setPreferredSize(new Dimension(300, 100));
		JPanel[] aP = new JPanel[6];
		
		JPanel[] imgP = new JPanel[6];
		
		avt = new JRadioButton[6];
		avtG = new ButtonGroup();
		blankP = new JPanel();
		blankP.setPreferredSize(new Dimension(300, 100));
		for(int i = 0 ; i < 6 ; i++ ) {
			Image tmp = img[i];
			imgP[i] = new JPanel() {
				@Override
				public void paint(Graphics g) {
					g.drawImage(tmp, 0, 0, null);
				}
			};
			imgP[i].setPreferredSize(new Dimension(80, 80));
			aP[i] = new JPanel(new BorderLayout());
			aP[i].setPreferredSize(new Dimension(80, 100));
			aP[i].add(imgP[i], BorderLayout.CENTER);
			avt[i] = new JRadioButton("avatar" + (i+1));
			avt[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mVO.setAvatar("img_" + e.getActionCommand() + ".png");
				}
			});
			avt[i].setPreferredSize(new Dimension(80, 20));
			avtG.add(avt[i]);
			aP[i].add(avt[i], BorderLayout.SOUTH);
			if(i < 3) {
				avtContMP.add(aP[i]);
			} else {
				avtContFP.add(aP[i]);
			}
		}
		
		// black JPanel
		avtSubP = new JPanel(new BorderLayout());
		JPanel h20 = new JPanel();
		h20.setPreferredSize(new Dimension(300, 20));
		blankP.setVisible(false);
		avtContMP.setVisible(true);
		avtContFP.setVisible(false);
		avtSubP.add(h20, BorderLayout.NORTH);
		avtSubP.add(avtContMP, BorderLayout.CENTER);
//		avtSubP.add(avtContFP, BorderLayout.CENTER);
//		avtSubP.add(blankP, BorderLayout.CENTER);
		
		// gender 선택창
		gen = new JRadioButton[2];
		ButtonGroup genG = new ButtonGroup();
		gen[0] = new JRadioButton("Male");
		gen[1] = new JRadioButton("Female");
		gen[0].addActionListener(new GBtnEvt());
		gen[1].addActionListener(new GBtnEvt());
		genG.add(gen[0]);
		genG.add(gen[1]);
		
		JPanel genContP = new JPanel(new GridLayout(1, 2));
		genContP.add(gen[0]);
		genContP.add(gen[1]);
		
		nameP.add(name, BorderLayout.CENTER);
		idP.add(id, BorderLayout.CENTER);
		pwP.add(pw, BorderLayout.CENTER);
		repwP.add(repw, BorderLayout.CENTER);
		telP.add(telContP, BorderLayout.CENTER);
		genP.add(genContP, BorderLayout.CENTER);
		mailP.add(mail, BorderLayout.CENTER);
		avtP.add(avtSubP, BorderLayout.CENTER);
		
		JPanel btnP = new JPanel();
		btnP.setPreferredSize(new Dimension(500, 70));
		sBtn = new JButton("Submit");
		sBtn.addActionListener(new JoinEvt(this));
		btnP.add(sBtn);
		
		subP.add(nameP);
		subP.add(idP);
		subP.add(pwP);
		subP.add(repwP);
		subP.add(telP);
		subP.add(mailP);
		subP.add(genP);
		subP.add(avtP);
		mainP.add(subP, BorderLayout.CENTER);
		mainP.add(btnP, BorderLayout.SOUTH);
		
		add(mainP);
	}
	
	// 이미지 로딩
	public void loadImg(int cnt) {
		img = new Image[cnt];
		for(int i = 0; i < cnt ; i++ ) {
			img[i] = new ImageIcon(new ImageIcon("src/MyProj/view/img/img_avatar" + (i+1) +".png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)).getImage();
		}
	}
	
	public class GBtnEvt implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			mVO.setGen(e.getActionCommand().equals("Male") ? "M" : "F");
			avtG.clearSelection();
			if(e.getActionCommand().equals("Male")) {
				blankP.setVisible(false);
				avtContFP.setVisible(false);
				avtContMP.setVisible(true);
				avtSubP.remove(blankP);
				avtSubP.remove(avtContMP);
				avtSubP.remove(avtContFP);
				avtSubP.add(avtContMP, BorderLayout.CENTER);
			} else {
				blankP.setVisible(false);
				avtContMP.setVisible(false);
				avtContFP.setVisible(true);
				avtSubP.remove(blankP);
				avtSubP.remove(avtContMP);
				avtSubP.remove(avtContFP);
				avtSubP.add(avtContFP, BorderLayout.CENTER);
			}
		}
	}
}
