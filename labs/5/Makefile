.PHONY: default clean

default:
	@echo "---------- Hotel Occupancy ----------"
	@make -sC hotel_occupancy run
	@echo
	@echo "---------- Average Rainfall ----------"
	@make -sC average_rainfall run

clean:
	@make -sC hotel_occupancy clean
	@make -sC average_rainfall clean
