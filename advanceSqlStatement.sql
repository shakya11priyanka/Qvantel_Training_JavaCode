
select length(first_name) from customer
select first_name || ' '|| last_name from customer

select length(first_name) from payment
select to_char(payment_date,'Month   yyyy') from payment

select age(payment_date) from payment

select extract(year from payment_date) as year from payment
select age(payment_date) from payment
select timeofday()

show timezone
SELECT Now()
show timezone
select * from customer
full outer join payment on customer.customer_id=payment.customer_id;
select * from customer left outer join payment on customer.customer_id = payment.customer_id;

