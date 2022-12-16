/*
 * package com.Flight.Booking.System.Faremicroservice;
 * 
 * import static org.mockito.Mockito.when;
 * 
 * import java.util.stream.Collectors; import java.util.stream.Stream;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.mock.mockito.MockBean;
 * 
 * import com.Flight.Booking.System.Faremicroservice.Repository.FareRepository;
 * import com.Flight.Booking.System.Faremicroservice.Service.FareService;
 * 
 * @SpringBootTest class FareMicroserviceApplicationTests {
 * 
 * @Autowired private FareService fareservice;
 * 
 * @MockBean private FareRepository farerepository;
 * 
 * public void getfareTest() { when(farerepository.findAll()) .thenReturn(Stream
 * .of(new fare("10001","jfgh","fhg","hvfdhjv")) .collect(Collectors.toList()));
 * assertEquals(10001,fareservice.savefare(10001));
 * 
 * 
 * }
 * 
 * @Test void contextLoads() { }
 * 
 * }
 */