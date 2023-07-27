select * from customer
full outer join payment on customer.customer_id=payment.customer_id;
select * from customer left outer join payment on customer.customer_id = payment.customer_id;
select film.film_id, title, inventory_id from film left join inventory on  inventory.film_id=film.film_id;
select film.film_id, title, inventory_id from film right join inventory on  inventory.film_id=film.film_id;