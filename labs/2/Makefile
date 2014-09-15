.PHONY: default clean

default:
	@echo "---------- Stock Commission ----------"
	@make -sC stock_commission run
	@echo
	@echo "---------- Energy Drink Consumption ----------"
	@make -sC energy_drink_consumption run
	@echo
	@echo "---------- Stock Transaction Program ----------"
	@make -sC stock_transaction_program run

clean:
	@make -sC stock_commission clean
	@make -sC energy_drink_consumption clean
	@make -sC stock_transaction_program clean
