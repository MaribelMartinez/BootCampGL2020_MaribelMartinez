select *
from BOOTCAMP.ANIMALS 
group by species, name having species = 'Lupus'
order by id + 0 DESC
