
	package MethodOverriding;
	class Telecompany{
		public void getLang() {
			System.out.println("English");
		}
		public void getwallpaper() {
			System.out.println("default");
		}
		public void getCallertune() {
			System.out.println("default");
		}
		public void getlock() {
			System.out.println("No lock");
		}
	}
	class Boys extends Telecompany{
		public void getWallpaper() {
			System.out.println("Nagul photo");
		}
		public void getLock() {
			System.out.println("1431");
		}
	}
	class Girls extends Telecompany{
		public void getWallpaper() {
			System.out.println("snapchat photo");
		}
		public void callerTune() {
			System.out.println("chitti na bulbul chitti");
		}
	}
	public class Phone{
		public static void main(String args[]) {
			System.out.println("child: boys");
			Boys b1=new Boys ();
			b1.getwallpaper();
			b1.getLock();
			System.out.println("child : girls");
			Girls g1= new Girls ();
			g1.getwallpaper();
			g1.callerTune();
		}
	}


