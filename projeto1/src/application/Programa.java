package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Comment;
import entities.Post;

public class Programa {
	
	public static void main(String[] args) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
								//have nice trip
		Comment c1 = new Comment("Tenha uma boa viagem.");
								//wow that's awesome
		Comment c2 = new Comment("Uau, isso é incrível.");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para a Nova Zelândia", 
				"Vou visitar este país maravilhoso.", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
	}

}
