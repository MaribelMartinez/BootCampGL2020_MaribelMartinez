select *
from BOOTCAMP.ANIMALS 
group by species, name having species = 'Felidae'
order by id + 0 DESC
