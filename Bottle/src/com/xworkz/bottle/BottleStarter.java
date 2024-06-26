package com.xworkz.bottle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.xworkz.bottle.dto.BottleDto;

public class BottleStarter {

	public static void main(String[] args) {

		List<BottleDto> list = new ArrayList<BottleDto>();

		BottleDto dto = new BottleDto("Bislari", "LightBlue", "Dubai", "Plastic", "TwoLitre", 50, 5, 577500090, 2029,
				2024);
		BottleDto dto1 = new BottleDto("Kelsi", "Grey", "Mumbai", "Stil", "OneLitre", 40, 4.5, 676709000, 2030, 2025);
		BottleDto dto2 = new BottleDto("Ro", "Black", "Hydrabad", "Brance", "OffLitre", 35, 3.5, 122500090, 2028, 2027);
		BottleDto dto3 = new BottleDto("Aqua", "RoyalBlur", "Delhi", "Metal", "ThreeLitre", 23, 2.5, 222500090, 2027,
				2026);
		BottleDto dto4 = new BottleDto("Neer", "Orange", "Agra", "LowPlastic", "FourLitre", 70, 1.5, 787500090, 2025,
				2020);
		BottleDto dto5 = new BottleDto("Purifier", "Pink", "Kolkate", "Gold", "SixLitre", 90, 2.6, 597500090, 2024,
				2021);
		BottleDto dto6 = new BottleDto("Qua", "Green", "Madras", "Silver", "FiveLitre", 100, 2.9, 447500090, 2023,
				2022);
		BottleDto dto7 = new BottleDto("Forbes", "Yellow", "Cochin", "MediumSilver", "SevenLitre", 150, 1.8, 477500090,
				2022, 2030);
		BottleDto dto8 = new BottleDto("Signature", "Purple", "Simla", "CoverPlastic", "EightLitre", 250, 1.4,
				877500090, 2039, 2032);
		BottleDto dto9 = new BottleDto("TataCopper", "Red", "Bangalore", "Copper", "TenLitre", 1050, 2.2, 897500090,
				2029, 2040);

		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		list.add(dto6);
		list.add(dto7);
		list.add(dto8);
		list.add(dto9);

//========================================================================
//		Comparator<BottleDto> cmr = new Comparator<BottleDto>() {
//
//			@Override
//			public int compare(BottleDto o1, BottleDto o2) {
//				 return (int)(o1.getPrice() - o2.getPrice());
//				
//			}
//			
//		};

//		Comparator<BottleDto> cmr = (o1, o2) -> (int)(o2.getPrice() - o1.getPrice());
//		Collections.sort(list, cmr);
//		
//				list.forEach(ref -> {
//					System.out.println(ref);
//				}); 

//				consumer<t>= input taking but it does return it retur r type
//				consumer having internally void accept(T t)
//				Consumer<T> accepts the object as argument
//				consumer having accept method that method return void

//		T is the type of the input argument.
//		R is not directly relevant in the context of Consumer,
//		as it doesn't represent the return type of the operation.

//		===============================================================

//		Comparator<BottleDto> cmr =(o1,o2)->(int)(o1.getRating()-o2.getRating());
//			
//		
//		Collections.sort(list, cmr);
//		
//				list.forEach(ref -> {
//					System.out.println(ref);
//				});
//
//		====================================================================

//		Comparator<BottleDto> cmr = new Comparator<BottleDto>() {
//
//			@Override
//			public int compare(BottleDto o1, BottleDto o2) {
//				   return (int)(o1.getCustomerNumber() - o2.getCustomerNumber());
//				
//			}
//			
//		};
//		Collections.sort(list, cmr);
//		
//				list.forEach(ref -> {
//					System.out.println(ref);
//				});
//		====================================================================
//		Comparator<BottleDto> cmr = new Comparator<BottleDto>() {
//
//			@Override
//			public int compare(BottleDto o1, BottleDto o2) {
//				return (int) (o1.getManufactureDate() - o2.getManufactureDate());
//
//			}
//
//		};
////		Collections.sort(list, cmr);
//		Collections.sort(list);
////
//				list.forEach(ref -> {
//					System.out.println(ref);
//				});
//		=======================================================================
//		Comparator<BottleDto> cmr = new Comparator<BottleDto>() {
//
//			@Override
//			public int compare(BottleDto o1, BottleDto o2) {
//				return o1.getBottleName().compareTo(o2.getBottleName());
//
//			}
//		};
//
//		Collections.sort(list, cmr);

//
//		list.forEach(ref -> {
//			System.out.println(ref);
//		});

//		=========================================================================

		List<BottleDto> filteredList = list.stream().filter(one -> one.getPrice() < 1050) // Filter out items with price
																							// less than 1050
				.filter(two -> two.getPrice() == 40) // Filter out items with price equal to 40
				.collect(Collectors.toList()); // Collect the filtered elements into a new list

		// Print the filtered list
//		filteredList.forEach(System.out::println);

		filteredList.forEach(ref -> {
			System.out.println(ref);
		});
//		predicate return boolean and predicate an interface that contains only one abstract method 
		// Predicate: Predicate is a functional interface in Java 8
//		that can be used to pass a lambda function as an argument to the filter method. 
//		Lambda Expression Lambda functions are inline functions that can take arguments as well as return values.

	}
}
