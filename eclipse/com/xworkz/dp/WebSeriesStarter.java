package com.xworkz.dp;

import com.xworkz.dp.constants.Genre;
import com.xworkz.dp.dao.WebSeriesDAO;
import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesStarter {

	public static void main(String[] args) {
		
		// dto
		WebSeriesDTO seriesDTO = new WebSeriesDTO();
		
		seriesDTO.setName("Vampire Diaries");
		seriesDTO.setGenre(Genre.HORROR);
		seriesDTO.setCast("Joseph Morgan");
		seriesDTO.setNoOfCharacters(500);
		seriesDTO.setRating(4.5F);
		seriesDTO.setTotalSeasons(5);
		seriesDTO.setCurrentSeason(4);

		WebSeriesDTO seriesDTO2 = new WebSeriesDTO("The Hobbit", Genre.ADVENTURE, "Ina McKellen", 598, 4.8F, 3, 3);
		WebSeriesDTO seriesDTO3 = new WebSeriesDTO("The Hobbit", Genre.ADVENTURE, "Martin Freeman", 598, 4.8F, 3, 3);
		WebSeriesDTO seriesDTO4 = new WebSeriesDTO("The Hobbit", Genre.ADVENTURE, "Cate Blanhett", 598, 4.8F, 3, 3);

		// dao
		WebSeriesDAO seriesDAO = new WebSeriesDAO();

		WebSeriesDTO[] ref = seriesDAO.getDtos();

		ref[0] = seriesDTO2;
		ref[1] = seriesDTO3;
		ref[2] = seriesDTO4;
		

		seriesDAO.save(seriesDTO);
		
		seriesDAO.delete(1);
		
		seriesDAO.update(seriesDTO3, 1);

		for (int i = 0; i < ref.length; i++) {

			WebSeriesDTO array = ref[i];

			if (array != null) {
				System.out.println(array.getName());
				System.out.println(array.getGenre());
				System.out.println(array.getCast());
				System.out.println(array.getNoOfCharacters());
				System.out.println(array.getRating());
				System.out.println(array.getTotalSeasons());
				System.out.println(array.getCurrentSeason());

				System.out.println("####################################");
			} else {
				System.err.println("array is pointing to null ".concat(String.valueOf(i)));
			}

		}
		
		//seriesDAO.display();

	}

}
