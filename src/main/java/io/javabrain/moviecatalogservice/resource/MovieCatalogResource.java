package io.javabrain.moviecatalogservice.resource;

import io.javabrain.moviecatalogservice.model.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource
{
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String id)
	{
		return Arrays.asList(new CatalogItem("Avengers", "2023 Avengers new movie", 5), new CatalogItem("The incredible Hulk", "hulkie bolkie malkie", 5));
	}
}
