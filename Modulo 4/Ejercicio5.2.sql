select *
from BOOTCAMP.ANIMALS 
where weight > 100
group by species, name having species = 'Lupus'
order by id + 0 asc
