







Insert into newhotel values (12, 'Sheraton',39,'Dalton Street','Boston','MA',02115,42.346756,-71.084336,100, 'C:\Users\Ayushkumar\Desktop\sheraton.jpg');

Insert into newhotel values (14, 'Marriot',110,'Huntington Ave','Boston','MA',02115,42.347838, -71.079168,116, 'C:\Users\Ayushkumar\Desktop\marriot.jpg');

Insert into newhotel values (16, 'Hilton',120,'Newport','New york','NY',02840,41.490374, -71.311127,120, 'C:\Users\Ayushkumar\Desktop\marriot.jpg');



Insert into newcustomer values (20,'Ayush',9876554,'ag@gmail.com');

Insert into newcustomer values (30,'Akshat',9876554785,'aj@gmail.com');

Insert into newcustomer values (40,'Sanket',9876554,'s@gmail.com');



insert into newsuppliers values (30,'expedia',1);

insert into newsuppliers values (31,'hotelbeds',1);

insert into newsuppliers values (32,'hotelscom',1);



Insert into newtravelagency values (41,'trivago',31);

insert into newsuppliers values (43,'bookingcom',32);



Insert into newbookings values (1007,current_date(),'confirmed','2017-12-18','2017-12-20',20,40);


select pricepernight from newhotel where hotelid=14;

Insert into newpayments values (111,100,current_date(),1000);


Insert into newlogs values (8888,'BTYD-GFRD-YDES','C:\Users\Ayushkumar\Desktop\log.xml','C:\Users\Ayushkumar\Desktop\log.xml',1000);


select current_date();


select distance(16,20);

show events;


DELIMITER $$
CREATE DEFINER=`root`@`localhost` EVENT `Backup` 
ON SCHEDULE EVERY 10 minute 
STARTS '2017-12-11 18:09:00' ON COMPLETION PRESERVE ENABLE 
DO 
BEGIN

SET @sql_text = CONCAT("SELECT * FROM dataproject.newbookings INTO OUTFILE 'C:/Users/Ayushkumar/Desktop/backup/backup.csv'"); 
PREPARE s1 FROM @sql_text; 
EXECUTE s1; 
DEALLOCATE PREPARE s1;
END $$
DELIMITER ;




show processlist;




update newbookings set checkindate = (2017-12-14)and checkoutdate=(2017-12-18) where bookingid=1000;

SELECT DATEDIFF(checkindate,checkoutdate) from newbookings where bookingid=1000;


Insert into newuseraccount values (1,'agupta','12345',20);

Insert into newcustomersupport values (1,'booking','cancelled',100,20);


insert into newoffers values(5,'FALL45','50',12);

delete from newbookings where bookingid=1000;

 
update dataproject.newbookings set status='cancelled' where bookingid=1001;

select distance ('42.346756','-71.084336','42.33962','-71.089094');


select current_date();
 


DELIMITER $$
CREATE DEFINER=`root`@`localhost` EVENT `Backup` 
ON SCHEDULE EVERY 1 minute 
STARTS '2017-12-11 18:09:00' ON COMPLETION PRESERVE ENABLE 
DO 
BEGIN
SET @sql_text = CONCAT("SELECT * FROM dataproject.newbookings INTO OUTFILE 'C:/Users/Ayushkumar/Desktop/backup/backup.csv'"); 
PREPARE s1 FROM @sql_text; 
EXECUTE s1; 
DEALLOCATE PREPARE s1;
END $$
DELIMITER ;
SET GLOBAL event_scheduler = ON;
show processlist;

select * from supplier_hotel;

----------------------------------------------------------------
Stored procedure:-
call total_amount (bookingid,hotelid)
call tot_amount(1007,16);

------------------------------------------------------------------

Views:-
select * from supplier_hotel;

select * from issuestatus;

select * from agency_suppliers;

--------------------------------------------------------------------
Functions
select distance(hotelid,customerid)
select distance(14,20);

------------------------------------------------------------------------
Triggers

cancel_booking
delimiter #
create trigger cancel_booking after update on dataproject.newbookings
for each row

begin
set @booking=NEW.bookingid;
 IF NEW.status ='cancelled' THEN  
  insert into dataproject.newcancelledbookings (reason,bookings_bookingid)values ('Reason',@booking);
  end IF;
end#

delimiter ;

sec_pass
CREATE TRIGGER sec_pass before INSERT ON
 dataproject.newuseraccount 
FOR EACH ROW SET NEW.Password = password(NEW.Password);

valid_dt
date validations in booking table

apply_offer
Insert a value in offers









