class pr002 {
	public static void main(String args[]){
		byte b, bb, bbb; //8-битная переменная
		short s, ss, sss; //16-битная переменная
		int i, ii, I;//32-битная переменная
		long l, ll, L;//64-битная переменная
		
		b = 127;
		bb = (byte)128;
		s = 32000;
		ss = (short)33000;
		System.out.println("bb = " + bb + "\nss = " + ss);
		sss = 100;
		//bbb = sss; Автопреопразование типов запрещено, так как может привести к искажению значений
		bbb = (byte)sss;
		System.out.println("bbb = " + bbb + "\nsss = " + sss);
		// Пример использования различныхцелых типов данных
		ii = 700000; //Сторона куба в мм
		int v = ii*ii*ii; // Объём куба в мм3
		System.out.println("Объём куба " + v);
		long vv = (long)ii*ii*ii; // Объём куба в мм3
                System.out.println("Объём куба " + vv);
		double d, dd;
		d = b/2;
		System.out.println("d = " + d);
		dd = (double)b/2;
                System.out.println("dd = " + dd);
		//Символьный тип данных
		System.out.println("Примеры использования символьного типа\n");
		char ch;
		ch = 'D';
		System.out.println("Значение ch: " + ch);
		ch++;
		System.out.println("Новое значение ch: " + ch);
		ch = 97;
		System.out.println("Новейшее значение ch с кодом 97: " + ch);
		I = (int)ch;
		System.out.println("Значение I = (int)ch: " + I);
		ch = 'А';
		for(i = 0; i<63; i++){
			I = (int)ch;
			System.out.println("Код символа " + ch + ": " + I);
			ch++;
		}
		//Логический тип данных
		System.out.println("Примеры использования логического типа\n");
		boolean bool;
		bool = false;
		System.out.println("Значение bool:" + bool);
		bool = true;
                System.out.println("Значение bool:" + bool);
		if(bool){
			System.out.println("Условие \"bool\" выполнено");
		}
		if(!bool){
                        System.out.println("Условие \"!bool\" выполнено");
                }
		bool = ch=='я';
		if(bool){
			System.out.println("Символ ch равен \"я\" ");
		}		
		//логические операции над значениями
		System.out.println("\n");
                boolean p, q;
                System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
                p = true; q = true;
                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (!p));
                p = true; q = false;
                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (!p));
                p = false; q = true;
                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (!p));
                p = false; q = false;
                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q)  + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (!p));
		//пример неожиданного повышения типов данных
                
		System.out.println("\n");
                byte b11;
                int i11;
                b11 = 10;
                i11 = b11 * b11; //при операции перемножения типов байт получается повышение результата до типа int
                b11 = 10;
                b11 = (byte)(b11*b11); //необходимо приведение типа int к типу byte
                System.out.println("i11 and b11" + i11 + " " + b11);

	}
}
