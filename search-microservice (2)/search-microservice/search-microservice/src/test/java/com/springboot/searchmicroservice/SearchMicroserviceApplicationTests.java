
  package com.springboot.searchmicroservice;
  
  import static org.junit.jupiter.api.Assertions.assertEquals;
  import static org.mockito.Mockito.when;
  
  import java.util.List; import java.util.stream.Collectors; 
  import java.util.stream.Stream;
  
  import org.junit.jupiter.api.Test;
  import org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.boot.test.context.SpringBootTest;
  import org.springframework.boot.test.mock.mockito.MockBean;
  
  import com.springboot.searchmicroservice.entity.search; 
  import com.springboot.searchmicroservice.repository.SearchRepository;
  import com.springboot.searchmicroservice.service.SearchService;
  
  import io.micrometer.core.instrument.search.Search;
  
  @SpringBootTest 
  public class SearchMicroserviceApplicationTests {
  
  @Autowired 
  private SearchService searchService;
  
  @MockBean
  private SearchRepository searchRepository;
 
  public void getSearchTest() {
	  when(searchRepository.findAll()) .thenReturn((List<search>) Stream.of
			  (new search("1","Airline","5/12/22","warangal","guntur", "2000"), 
			   new search("2","go first","11/12/22","vijyanagram","odisha", "8990"))
               .collect(Collectors.toList()));
  assertEquals(2, searchService.getAllSearches().size()); }
  
  @Test
  public void saveSearchTest() { 
	  search search = new search("3", "indigo","3/12/22","warangal","kakinada", "4355");
  when(searchRepository.save(search)).thenReturn(search); assertEquals(search,
  searchService.updateSearch(search)); }
  
  
  @Test public void addSearchTest() { 
	  search search =new search("4","airindia","12/12/22", "vijyawada","vizag", "3000"); 
	  when(searchRepository.save(search)).thenReturn(search); 
	  assertEquals(search,searchService.addsearch(search));
  
  }
  
  
  @Test public void getSearchTest1() { 
	  search search =new search("4","airindia","12/12/22", "vijyawada","vizag", "3000"); 
	  when(searchRepository.save(search)).thenReturn(search); 
	  assertEquals(search,searchService.getsearch(search));
  
  }
  
  
  @Test public void deleteSearchTest() { 
	  search search =new search("4","airindia","12/12/22", "vijyawada","vizag", "3000"); 
	  when(searchRepository.save(search)).thenReturn(search); 
	  assertEquals(search,searchService.deletesearch(search));
  
  }
  
  
  
  @Test public void updateSearchTest() { search search =new search("1",
  "Indigo","12/12/22", "vijyawada","vizag", "3000"); when
  (searchRepository.save(search)).thenReturn(search);
  assertEquals(search,searchService.updateSearch(search)); }
  
  
  }
 