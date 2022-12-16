/*
 * package com.flight.booking.system.bookingmicroservice;
 * 
 * import static org.mockito.Mockito.when;
 * 
 * import java.util.stream.Collectors;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.mock.mockito.MockBean;
 * 
 * import com.flight.booking.system.bookingmicroservice.entity.Booking; import
 * com.flight.booking.system.bookingmicroservice.repository.BookingRepository;
 * import com.flight.booking.system.bookingmicroservice.service.BookingService;
 * import com.mongodb.connection.Stream;
 * 
 * @SpringBootTest public class BookingMicroserviceApplicationTests {
 * 
 * @Autowired private BookingService bookingService;
 * 
 * 
 * 
 * 
 * 
 * @MockBean private BookingRepository bookingRepository;
 * 
 * @Test public void getallFlightsTest() {
 * when(bookingRepository.findAll()).thenReturn( Stream .of(new
 * Booking(2008,"preethi","female","21","mvp colony vizag",
 * 45,5585655856L,"vizag","benguluru",new Date("2022-12-12")))
 * .collect(Collectors.toList()));
 * assertEquals(1,bookingService.getalltickets().size()); }
 * 
 * @Test public void addFlightDetailsTest() { Booking booking =new Booking
 * (2008,"preethi","female","21","mvp colony, vizag",
 * 45,5585655856L,"vizag","bengulouru","2022-12-12");
 * when(bookingRepository.insert(booking)).thenReturn(booking);
 * assertEquals(booking, bookingService.addTicket(booking)); }
 * 
 * 
 * }
 * 
 */